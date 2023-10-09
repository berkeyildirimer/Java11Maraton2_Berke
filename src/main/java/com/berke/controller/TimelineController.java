package com.berke.controller;

import com.berke.service.TimelineService;

public class TimelineController {
    TimelineService timelineService;

    public TimelineController() {
        this.timelineService= new TimelineService();
    }
}
