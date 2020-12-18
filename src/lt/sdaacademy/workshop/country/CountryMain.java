package lt.sdaacademy.workshop.country;

public class CountryMain {
    public static void main(String[] args) {
        Country[] countries = buildCountryArray();

        printLeastPollutedCountry(countries);

    }

    public static void printLeastPollutedCountry(Country[] countries) {
        Country leastPollutedCountry = countries[0];

        for (int i = 0; i < countries.length; i++) {
            if (calculateCo2Emission(leastPollutedCountry) > countries[i].getCo2Emission()) {
    leastPollutedCountry = countries[i];
            }
        }
        System.out.println("Least polluted country: " + leastPollutedCountry.getName());
    }

    public static double calculateCo2Emission(Country country) {
        switch (country.getPollutionFactor()) {
            case "factorie":
                return country.getCo2Emission() * 1.4;
            case "transportation":
                return country.getCo2Emission() * 0.9;
            case "animal husbandry":
                return country.getCo2Emission() * 4.0;
            default:
                return country.getCo2Emission();
        }
    }

    public static Country[] buildCountryArray() {
        return new Country[] {
                new Country("Lithuania", 500, "transportation"),
                new Country("Germany", 100, "factories")
        };
    }
}
