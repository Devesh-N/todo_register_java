# User Registration API Documentation

## Overview

This document provides detailed information about the User Registration API for [Your Application Name]. This API enables new users to register by providing their username and password.

## Base URL

The base URL for accessing the API is: `http://13.233.137.8:8080/api/users`

## Endpoints

### Register a New User

- **URL:** `/register`
- **Method:** `POST`
- **Description:** Allows new users to register to the system.
- **Content-Type:** `application/json`
- **Body Parameters:**
    - `username` (String): The desired username for the new user.
    - `password` (String): The password for the new user account.

#### Request Example:

```json
POST /api/users/register
Host: 13.233.137.8:8080
Content-Type: application/json

{
    "username": "newUser",
    "password": "userPassword123"
}
