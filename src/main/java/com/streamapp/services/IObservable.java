package com.streamapp.services;

/**
 * @author Turleque Fabrice
 * @version 1.0
 * @created 24-oct.-2023 13:27:10
 */
public interface IObservable {

    /**
     *
     * @param observer
     */
    public void subscribe(IObserver observer);

    /**
     *
     * @param observer
     */
    public void RemoveObserver(IObserver observer);

    public void notifySuscriber();
}
