# tool-box

## GraphQL

### Server url
```
http://localhost:8080/graphql
```

### Queries
```
query {
    findAllEmployees {
      	id,
        firstName,
        lastName,
        departmentId
    }
}
```

### Mutations
```
mutation {
  saveEmployee(
    firstName: "test",
    lastName: "test",
    departmentId: 1) {
    id, 
    firstName,
    lastName,
    departmentId
  }
}
```
