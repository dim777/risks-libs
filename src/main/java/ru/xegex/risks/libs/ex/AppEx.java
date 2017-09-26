package ru.xegex.risks.libs.ex;

/**
 * Created by Dmitry.Erohin dim777@ya.ru on 26.04.2017.
 * Copyright (C) 2017 - present by <a href="https://www.ineb.ru/">Ineb Inc</a>.
 * Please see distribution for license.
 */
public abstract class AppEx extends Exception{
    public AppEx(Throwable cause) {
        super(cause);
    }
    public AppEx(String message) {
        super(message);
    }
    public AppEx() {
        super();
    }
}
