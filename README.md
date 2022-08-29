# Voting app

> Backend application for casting votes

## Table of Contents

<!-- TOC -->

* [Features](#features)
* [Api description](#api-description)
* [Technologies used](#technologies-used)
* [Running application](#running-application)

<!-- TOC -->

## Features

User should be able to add candidates and voters and then select candidate & voter in order to cast a vote.

## Api description

* Get all candidates

```shell
curl --location --request GET '{server_url}/v1/candidates'
```

* Add candidate

```shell
curl --location --request POST '{server_url}/v1/candidate' \
--header 'Content-Type: application/json' \
--data-raw '{
    "firstName": "John",
    "lastName": "Doe"
}'
```

* Get all voters

```shell
curl --location --request GET '{server_url}/v1/voters'
```

* Add voter

```shell
curl --location --request POST '{server_url}/v1/voter' \
--header 'Content-Type: application/json' \
--data-raw '{
    "firstName": "John",
    "lastName": "Doe"
}'
```

* Cast vote

```shell
curl --location --request POST '{server_url}/v1/vote' \
--header 'Content-Type: application/json' \
--data-raw '{
    "candidateId": 2,
    "voterId": 2
}'
```

## Technologies used

* Build tool - gradle
* Application - Spring Framework
* ORM - JPA/Hibernate
* Tests - Spock
* Database - PostgreSql
* Db migration - Liquidbase

## Running application

Connect to database setting up env variables: `DATABASE_HOST`,  `DATABASE_PORT`, `DATABASE_NAME`, `DATABASE_USERNAME`
and `DATABASE_PASSWORD`.

or by starting up database docker container using command `$ docker-compose up` inside folder docker/
then create database with name voting

run application with command `$ ./gradlew bootRun`,
database schema will be created automatically
