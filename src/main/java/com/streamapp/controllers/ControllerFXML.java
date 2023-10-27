package com.streamapp.controllers;

import com.streamapp.services.ihm.ResizingServices;

public class ControllerFXML {
    ResizingServices resizingServices;

    private ResizingServices getResizingServices() {
        if(resizingServices == null) {
            resizingServices  = new ResizingServices();
        }
        return resizingServices;
    }

}
