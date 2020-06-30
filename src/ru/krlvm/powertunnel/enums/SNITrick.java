package ru.krlvm.powertunnel.enums;

public enum SNITrick {

    ERASE,
    SPOIL;

    public static SNITrick fromID(int id) {
        switch (id) {
            case 1: {
                return SPOIL;
            }
            case 2: {
                return ERASE;
            }
            default: {
                return null;
            }
        }
    }
}