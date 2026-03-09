# Spring Boot RESTful CRUD API Example with MySQL Database

Steps to ON server spring boot 2.5:

1.Go to your project folder run:
 mvn clean package  -DskipTests  

2.Go to your project folder run:

 mvn clean spring-boot:run


now apache is up.can access 


List API endpoint url:
1.http://localhost:8080/api/pesakit(lists all patients)
Method:GET
Output format:JSON
input:no input
output:[
  {
    "id": 1,
    "firstName": "Ahmad",
    "lastName": "Marzuki",
    "dateOfBirth": "1985-11-07T16:00:00.000+00:00",
    "phoneNumber": "60125544123",
    "email": "marzuki@lapasar.com",
    "address": "no 16,persiaran surian..",
    "emergencyContact": "60125544123",
    "bloodType": "AB_NEGATIVE",
    "isActive": true,
    "createdAt": null,
    "updatedAt": null
  }
]

2.http://localhost:8080/log/log(lists all logs audit trail)
Method:GET
Output format:JSON
input:no input
output:[
  {
    "id": 1,
    "firstName": "SAVENEWPATIENT",
    "lastName": "CreatePatient(firstName=e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855mohd, lastName=2zulkifli, dateOfBirth=Mon Aug 12 01:44:31 MYT 1985, phoneNumber=60125544111, email=marzuki@lapasar.com, address=saja, emergencyContact=60125544333, bloodType=null, isActive=true)",
    "createdAt": "2026-03-08T00:53:58.789"
  }
]
3.http://localhost:8080/api/pesakit/by-name?firstName=ahmad (search Nama pesakit)
Method:GET
Output format:JSON
input:no input
output:[
  {
    "id": 1,
    "firstName": "SAVENEWPATIENT",
    "lastName": "CreatePatient(firstName=e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855mohd, lastName=2zulkifli, dateOfBirth=Mon Aug 12 01:44:31 MYT 1985, phoneNumber=60125544111, email=marzuki@lapasar.com, address=saja, emergencyContact=60125544333, bloodType=null, isActive=true)",
    "createdAt": "2026-03-08T00:53:58.789"
  }
]
4.http://localhost:8080/api/pesakit/pageAndSortPesakit?page=0&size=5&sortBy=email&sortDirection=desc (lists all patients ada paging dan bleh sort)
Method:GET
Output format:JSON
input:no input
output:
{
  "content": [
    {
      "id": 1,
      "firstName": "Ahmad",
      "lastName": "Marzuki",
      "dateOfBirth": "1985-11-07T16:00:00.000+00:00",
      "phoneNumber": "60125544123",
      "email": "marzuki@lapasar.com",
      "address": "no 16,persiaran surian..",
      "emergencyContact": "60125544123",
      "bloodType": "AB_NEGATIVE",
      "isActive": true,
      "createdAt": null,
      "updatedAt": null
    },
    {
      "id": 2,
      "firstName": "2mohd",
      "lastName": "2zulkifli",
      "dateOfBirth": "1985-08-11T17:44:31.154+00:00",
      "phoneNumber": "60125544111",
      "email": "marzuki@lapasar.com",
      "address": "saja",
      "emergencyContact": "60125544333",
      "bloodType": null,
      "isActive": true,
      "createdAt": "2026-03-07T14:36:35.39",
      "updatedAt": null
    },
    {
      "id": 3,
      "firstName": "3mohd",
      "lastName": "3zulkifli",
      "dateOfBirth": "1985-08-11T17:44:31.154+00:00",
      "phoneNumber": "60125544111",
      "email": "marzuki@lapasar.com",
      "address": "saja",
      "emergencyContact": "60125544333",
      "bloodType": null,
      "isActive": true,
      "createdAt": "2026-03-07T14:36:35.39",
      "updatedAt": null
    },
    {
      "id": 4,
      "firstName": "4mohd",
      "lastName": "4zulkifli",
      "dateOfBirth": "1985-08-11T17:44:31.154+00:00",
      "phoneNumber": "60125544111",
      "email": "marzuki@lapasar.com",
      "address": "saja",
      "emergencyContact": "60125544333",
      "bloodType": null,
      "isActive": true,
      "createdAt": "2026-03-07T14:36:35.39",
      "updatedAt": null
    },
    {
      "id": 5,
      "firstName": "5mohd",
      "lastName": "5zulkifli",
      "dateOfBirth": "1985-08-11T17:44:31.154+00:00",
      "phoneNumber": "60125544111",
      "email": "marzuki@lapasar.com",
      "address": "saja",
      "emergencyContact": "60125544333",
      "bloodType": null,
      "isActive": true,
      "createdAt": "2026-03-07T14:36:35.39",
      "updatedAt": null
    }
  ],
  "pageable": {
    "sort": {
      "empty": false,
      "unsorted": false,
      "sorted": true
    },
    "offset": 0,
    "pageNumber": 0,
    "pageSize": 5,
    "unpaged": false,
    "paged": true
  },
  "totalPages": 2,
  "totalElements": 7,
  "last": false,
  "numberOfElements": 5,
  "size": 5,
  "number": 0,
  "sort": {
    "empty": false,
    "unsorted": false,
    "sorted": true
  },
  "first": true,
  "empty": false
}

5.http://localhost:8080/api/pesakit (insert new patients)
Method:POST
Output format:JSON

input:

{
  "firstName": "2mohd",
  "lastName": "7zulkifli",
  "dateOfBirth": "1985-08-11T17:44:31.154",
  "phoneNumber": "60125544111",
  "email": "marzuki@lapasar.com",
  "address": "saja",
  "emergencyContact": "60125544333",
		"bloodType": "B_POSITIVE",
  "isActive": true
}
Output:
{
  "id": 2,
  "firstName": "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855mohd",
  "lastName": "2zulkifli",
  "dateOfBirth": "1985-08-11T17:44:31.154+00:00",
  "phoneNumber": "60125544111",
  "email": "marzuki@lapasar.com",
  "address": "saja",
  "emergencyContact": "60125544333",
  "bloodType": null,
  "isActive": true,
  "createdAt": "2026-03-08T00:53:58.789",
  "updatedAt": null
}
6.http://localhost:8080/api/pesakits/1 (kemaskini patients)
Method:PUT
Output format:JSON

input:


{
  "id": 1,
  "firstName": "vb",
  "lastName": "B",
	"phoneNumber": "0125544111",
	"email": "a@a.com",
	  "address": "saja",
	  "emergencyContact": "ali 0123322212",
	  "isActive": true,
	"dateOfBirth": "1985-08-11T17:44:31.154",
	"bloodType": "A_POSITIVE"
	  
	

}
Output:
{
  "id": 1,
  "firstName": "aa",
  "lastName": "B",
  "dateOfBirth": "1985-08-11T17:44:31.154+00:00",
  "phoneNumber": "0125544111",
  "email": "a@a.com",
  "address": "saja",
  "emergencyContact": "ali 0123322212",
  "bloodType": null,
  "isActive": true,
  "createdAt": null,
  "updatedAt": "2026-03-07T17:49:47.602"
}


7.http://localhost:8080/api/pesakits/1 (soft delete patients)
Method:DELETE
Output format:JSON

input:


{
  "id": 2,
	"isActive": false
	  
	

}
Output:
{
  "id": 2,
  "firstName": "2mohd",
  "lastName": "2zulkifli",
  "dateOfBirth": "1985-08-11T17:44:31.154+00:00",
  "phoneNumber": "60125544111",
  "email": "marzuki@lapasar.com",
  "address": "saja",
  "emergencyContact": "60125544333",
  "bloodType": null,
  "isActive": false,
  "createdAt": "2026-03-07T13:19:29.371",
  "updatedAt": "2026-03-07T13:19:29.371"
}


8.http://localhost:8080/api/pesakit/1 (data patients by ID)
Method:GET
Output format:JSON

Input:no input


Output:
{
  "id": 1,
  "firstName": "Ahmad",
  "lastName": "Marzuki",
  "dateOfBirth": "1985-11-07T16:00:00.000+00:00",
  "phoneNumber": "60125544123",
  "email": "marzuki@lapasar.com",
  "address": "no 16,persiaran surian..",
  "emergencyContact": "60125544123",
  "bloodType": "AB_NEGATIVE",
  "isActive": true,
  "createdAt": null,
  "updatedAt": null
}







openapi 3  url:

http://localhost:8080/v3/api-docs

http://localhost:8080/swagger-ui/index.html

https://www.baeldung.com/spring-rest-openapi-documentation

integration test(JUNIT4 test)
/springboot-rest-mysql/src/test/java/com/mycompany/springrestmysql/service/PatientServiceNGTest.java
