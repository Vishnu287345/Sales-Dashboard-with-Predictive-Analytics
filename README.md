<div align="center" id="top"> 
<img src="documentation/images/app.gif" alt="sales-dashboard" />

&#xa0;

  <!-- <a href="https://sales-dashboard.netlify.app">Demo</a> -->
</div>

<h1 align="center">sales-dashboard</h1>

<p align="center">
  <img alt="Github top language" src="https://img.shields.io/github/languages/top/jocile/sales-dashboard?color=56BEB8">

  <img alt="Github language count" src="https://img.shields.io/github/languages/count/jocile/sales-dashboard?color=56BEB8">

  <img alt="Repository size" src="https://img.shields.io/github/repo-size/jocile/sales-dashboard?color=56BEB8">

  <img alt="License" src="https://img.shields.io/github/license/jocile/sales-dashboard?color=56BEB8">

  <img alt="Github issues" src="https://img.shields.io/github/issues/jocile/sales-dashboard?color=56BEB8" />

  <img alt="Github forks" src="https://img.shields.io/github/forks/jocile/sales-dashboard?color=56BEB8" />

  <img alt="Github stars" src="https://img.shields.io/github/stars/jocile/sales-dashboard?color=56BEB8" /> 
</p>

<!-- Status -->

<h4 align="center"> 
	🚧  sales-dashboard 🚀 Under construction...  🚧
</h4>

<hr>

<p align="center">
  <a href="#dart-about">About</a> &#xa0; | &#xa0; 
  <a href="#sparkles-features">Features</a> &#xa0; | &#xa0;
  <a href="#rocket-technologies">Technologies</a> &#xa0; | &#xa0;
  <a href="#white_check_mark-requirements">Requirements</a> &#xa0; | &#xa0;
  <a href="#checkered_flag-starting">Starting</a> &#xa0; | &#xa0;
  <a href="#books-references">References</a> &#xa0; | &#xa0;
  <a href="#memo-license">License</a> &#xa0; | &#xa0;
  <a href="https://github.com/acenelio" target="_blank">Author</a>
</p>

<br>

## :dart: About

Design of a web application sales performance analysis dashboard with spring backend and react frontend, form the [DevSuperior](https://devsuperior.com.br/) course.

## Developed activities:

- :heavy_check_mark: Create static front end look;
  - :construction: Publish the front end to Netlify;
- :heavy_check_mark: Create Spring Boot project;
- :heavy_check_mark: Create Git monorepo;
- :construction: Organize the project in layers;
  - :heavy_check_mark: REST controller;
  - :heavy_check_mark: Service;
  - :heavy_check_mark: Data access (Repository);
- :construction: Create entities;
- :construction: Database seeding;
- :construction: Create REST web services;
- :construction:: @PathVariable route parameters;
- :construction: Request parameters @RequestParam;
- :construction: Request body @RequestBody;
- :construction: Response from ResponseEntity<T> request;
- :construction: DTO Standard;
- :construction: full CRUD;
- :construction: Exception handling;
- :construction: Swagger UI (Open API3 collections, environments);
- :construction: Data pagination;
- :construction: Associations between entities (N-N);

## :sparkles: Features

- :construction: Product listing;
- :construction: Product search by id;
- :construction: Password recovery;
- :construction: Administrative area with CRUD;
- :construction: Sales dashboard;
- :construction: Detailed sales list;

## :rocket: Technologies

The following tools were used in this project:

The following tools were used in this project:

:heavy_check_mark: [Java 11](https://docs.oracle.com/en/java/javase/11/);\
:heavy_check_mark: [Maven](https://maven.apache.org/);\
:heavy_check_mark: [Spring Boot](https://glysns.gitbook.io/springframework/);\
:heavy_check_mark: [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.5.6/reference/htmlsingle/#boot-features-jpa-and-spring-data);\
:heavy_check_mark: [Swagger implementing springdoc-openapi](https://springdoc.org/);\
:heavy_check_mark: [Yarn - package management](https://yarnpkg.com/);\
:heavy_check_mark: [React](https://pt-br.reactjs.org/);\
:heavy_check_mark: [React Native](https://reactnative.dev/);\
:heavy_check_mark: [TypeScript](https://www.typescriptlang.org/);\
:heavy_check_mark: [Bootstrap](https://getbootstrap.com/);\
:heavy_check_mark: [Appexcharts.js](https://apexcharts.com/);\
:construction: [Postgresql 12](https://www.postgresql.org/about/news/postgresql-12-released-1976/);\
:construction: [PgAdmin](https://www.pgadmin.org/);\
:construction: [Heroku - plataform as a service](https://www.heroku.com/);\
:construction: [Netlify - web app server](https://www.netlify.com/);

## :white_check_mark: Requirements

Before starting :checkered_flag:, you need to have [Git](https://git-scm.com), [yarn](https://yarnpkg.com/) and [Java 11](https://docs.oracle.com/en/java/javase/11/) installed.

## :checkered_flag: Starting

```bash
# Clone this project
$ git clone https://github.com/jocile/sales-dashboard

# Access
$ cd sales-dashboard/frontend

# Install dependencies
$ yarn

# Run the project frontend
$ yarn start

# The server will initialize in the <http://localhost:3000>

# Access
$ cd ../backend

# Run the project
$ ./mvnw spring-boot:run

# The server will initialize in the browser
<http://localhost:8080>
```

## :books: References

:file_folder: [App documentation](documentation/);\
:link: [Bootcamp Documentation SDS 5 pt-br](https://github.com/devsuperior/sds5);\
:link: [Official Apache Maven documentation](https://maven.apache.org/guides/index.html);\
:link: [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.4.12/maven-plugin/reference/html/);\
:link: [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.4.12/maven-plugin/reference/html/#build-image);\
:link: [Spring Web](https://docs.spring.io/spring-boot/docs/2.5.6/reference/htmlsingle/#boot-features-developing-web-applications);\
:link: [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.5.6/reference/htmlsingle/#boot-features-jpa-and-spring-data);\
:link: [Spring Security](https://docs.spring.io/spring-boot/docs/2.7.0/reference/htmlsingle/#web.security);\
:link: [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/);\
:link: [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/);\
:link: [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/);\
:link: [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/);\
:link: [Securing a Web Application](https://spring.io/guides/gs/securing-web/);\
:link: [Spring Boot and OAuth2](https://spring.io/guides/tutorials/spring-boot-oauth2/);\
:link: [Authenticating a User with LDAP](https://spring.io/guides/gs/authenticating-ldap/);

## :memo: License

This project is under license from MIT. For more details, see the [LICENSE](LICENSE.md) file.

Made with :heart: by <a href="https://github.com/jocile" target="_blank">Jocile</a>

&#xa0;

<a href="#top">Back to top</a>
