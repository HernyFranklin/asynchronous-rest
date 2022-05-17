package com.hf.test.application.dummy.inbound;

import com.hf.test.domain.dummy.model.ChistesModel;
import com.hf.test.domain.dummy.repository.DummyRepository;
import com.hf.test.infrastructure.dummy.inbound.controller.Chistes;
import com.hf.test.infrastructure.dummy.inbound.controller.ResponseDTO;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Log4j2
@Service("ServiceExample")
public class ServiceExample {

    private final DummyRepository dummyRepository;

    public ServiceExample(DummyRepository dummyRepository) {
        this.dummyRepository = dummyRepository;
    }

    public ResponseDTO obtenerChistes() throws ExecutionException, InterruptedException {
        Instant start = Instant.now();
        ResponseDTO responseDTO = new ResponseDTO();
        List<Chistes> chistesList = new ArrayList<>();
        List<CompletableFuture<ChistesModel>> allFutures = IntStream.range(0, 15).mapToObj(i -> dummyRepository.obtenerChistesDeLaWeb()).collect(Collectors.toList());

        CompletableFuture.allOf(allFutures.toArray(new CompletableFuture[0])).join();

        for (int i = 0; i < 15; i++) {
            var chiste = allFutures.get(i).get();
            chistesList.add(new Chistes(chiste.getId(), chiste.getUrl(), chiste.getValue()));
        }
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        log.info("Total time: " + timeElapsed + " ms");
        log.info(chistesList.size());
        responseDTO.setChistesList(chistesList);
        return responseDTO;
    }
}
