package br.dev.detowhey.soap_to_rest.dto;

public record ZipCodeResponseDTO(
        String zipCode,
        String street,
        String neighborhood,
        String city,
        String uf,
        String state,
        String region
) {

    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder()
                .withZipCode(this.zipCode)
                .withStreet(this.street)
                .withNeighborhood(this.neighborhood)
                .withCity(this.city)
                .withUf(this.uf)
                .withState(this.state)
                .withRegion(this.region);
    }

    public static final class Builder {
        private String zipCode;
        private String street;
        private String neighborhood;
        private String city;
        private String uf;
        private String state;
        private String region;

        private Builder() {
        }

        public Builder withZipCode(String zipCode) {
            this.zipCode = zipCode;
            return this;
        }

        public Builder withStreet(String street) {
            this.street = street;
            return this;
        }

        public Builder withNeighborhood(String neighborhood) {
            this.neighborhood = neighborhood;
            return this;
        }

        public Builder withCity(String city) {
            this.city = city;
            return this;
        }

        public Builder withUf(String uf) {
            this.uf = uf;
            return this;
        }

        public Builder withState(String state) {
            this.state = state;
            return this;
        }

        public Builder withRegion(String region) {
            this.region = region;
            return this;
        }

        public ZipCodeResponseDTO build() {
            return new ZipCodeResponseDTO(zipCode, street, neighborhood, city, uf, state, region);
        }
    }
}
