package com.berkay.solid.service;

import com.berkay.solid.entity.Musteri;
import com.berkay.solid.repository.MusteriJpaRepository;
import com.berkay.solid.repository.MusteriRepository;

public class MusteriService {
    private MusteriRepository repository;

    /**
     * Musteri repository interface inden türetilmiş sınıf vermeniz yeterli.
     *
     * @param repository
     */
    public MusteriService (MusteriRepository repository){
        this.repository = repository;
    }
    public void save(Musteri musteri){
        MusteriRepository repository = new MusteriJpaRepository();
        repository.save(musteri);
    }
}
