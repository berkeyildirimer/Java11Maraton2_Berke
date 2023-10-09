package com.berke.service;

import com.berke.repository.TimelineRepository;

public class TimelineService {
    TimelineRepository timelineRepository;

    public TimelineService() {
        this.timelineRepository= new TimelineRepository();
    }
}
