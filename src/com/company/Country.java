package com.company;

public enum Country {
    RUSSIA("РОССИЯ", true),
    USA("США", false),
    EGYPT("ЕГИПЕТ", true),
    GERMANY("ГЕРМАНИЯ", false);

    private final boolean isOpen;
   private final String ruName;

    Country(final String ruName, final boolean isOpen) {
        this.ruName = ruName;
        this.isOpen = isOpen;
    }

    @Override
    public String toString() {
        return name() + " (" + ruName + ")";
    }

    public static Country getByRuName(final String nameToCheck) throws NoSuchCountryException {
        if (nameToCheck.equals(RUSSIA.ruName)) {
            return Country.RUSSIA;
        }
        if (nameToCheck.equals(USA.ruName)) {
            return Country.USA;
        }
        if (nameToCheck.equals(EGYPT.ruName)) {
            return Country.EGYPT;
        }
        if (nameToCheck.equals(GERMANY.ruName)) {
            return Country.GERMANY;
        } else {
            throw new NoSuchCountryException("Страны " + nameToCheck + " не существует.");
        }
    }

    public static String getOpen(final Country d) {
            if (d.isOpen) {
                return "открыта для посещения.";
            } else {
                return "закрыта для посещения.";
            }
        }

}



