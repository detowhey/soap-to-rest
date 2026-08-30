# 📍 ZipCode REST API

This service is a REST API built with Java and Spring Boot that acts as an integration layer (wrapper/adapter). It fetches Brazilian Zip Code (CEP) data from an external XML/SOAP service and transforms/standardizes the response into JSON format.

---

## 🚀 Technologies Used

* **Java 21**
* **Spring Boot 3.5.16**
* **Gradle** (Build tool)
* **Spring Web** (REST API development)
* **Jackson Dataformat XML** (XML deserialization)
* **Validation / `@Validated`** (Parameter validation)

---

## 🛠️ Running the Application Locally

### Prerequisites
* **Java 21** installed and configured on your machine.
* **Gradle** (or use the included `./gradlew` wrapper).

### Steps to Run

1. Clone the repository:
   ```bash
   git clone [https://github.com/detowhey/soap-to-rest.git](https://github.com/detowhey/soap-to-rest.git)
   cd soap-to-rest

## 📡 API Endpoints

The application provides the following endpoint for address lookups:

### 🔍 Search Zip Code

Transforms the provider's XML response into a clean JSON object.

* **URL:** `/api/zipcode/{zipCode}`
* **HTTP Method:** `GET`
* **Example Local URL:** `http://localhost:8080/api/zipcode/01001000`

---

## 📋 Response Status & Examples

### 🟢 200 OK — Success Response

Returned when the zip code is valid and found.

```json
{
  "cep": "01001-000",
  "street": "Praça da Sé",
  "neighborhood": "Sé",
  "city": "São Paulo",
  "uf": "SP",
  "state": "São Paulo",
  "region": "Sudeste"
}