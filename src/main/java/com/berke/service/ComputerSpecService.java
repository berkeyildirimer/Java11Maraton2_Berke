package com.berke.service;

import com.berke.repository.ComputerSpecRepository;
import com.berke.repository.entity.ComputerSpec;

public class ComputerSpecService {

    ComputerSpecRepository computerSpecRepository;
    public ComputerSpecService(){
        this.computerSpecRepository= new ComputerSpecRepository();
    }

    public ComputerSpec save(ComputerSpec computerSpec) {
        return computerSpecRepository.save(computerSpec);
    }
}
