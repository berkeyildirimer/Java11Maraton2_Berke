package com.berke.service;

import com.berke.repository.ComputerRepository;
import com.berke.repository.entity.Computer;

public class ComputerService {
    ComputerRepository computerRepository;
    public ComputerService(){
        this.computerRepository= new ComputerRepository();
    }

    public Computer save(Computer computer) {
        return computerRepository.save(computer);
    }
}
