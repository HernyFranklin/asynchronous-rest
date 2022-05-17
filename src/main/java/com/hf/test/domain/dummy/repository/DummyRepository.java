package com.hf.test.domain.dummy.repository;

import com.hf.test.domain.dummy.model.ChistesModel;

import java.util.concurrent.CompletableFuture;

public interface DummyRepository {

    CompletableFuture<ChistesModel> obtenerChistesDeLaWeb();

}
