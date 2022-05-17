package com.hf.test.infrastructure.dummy.outbound.mock;

import com.hf.test.domain.dummy.model.ChistesModel;
import com.hf.test.domain.dummy.repository.DummyRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.CompletableFuture;

@Component
@Log4j2
public class ExampleDummyRepositoryImpl implements DummyRepository {
    RestTemplate restTemplate = new RestTemplate();

    @Override
    @Async
    public CompletableFuture<ChistesModel> obtenerChistesDeLaWeb() {
        ResponseEntity<ChistesModel> responseGet = restTemplate.getForEntity("https://api.chucknorris.io/jokes/random", ChistesModel.class);
        return CompletableFuture.completedFuture(responseGet.getBody());
    }

}
