```shell
./gradlew bootRun
```

```shell
curl "http://localhost:8080/books/1"
```
```shell
curl "http://localhost:8080/books/search/findByName?name=xxx"
```


<details>
<summary>ALPSの例</summary>

```shell
curl "http://localhost:8080/profile/books"
```

```json
{
  "alps" : {
    "version" : "1.0",
    "descriptor" : [ {
      "id" : "book-representation",
      "href" : "http://localhost:8080/profile/books",
      "descriptor" : [ {
        "name" : "name",
        "type" : "SEMANTIC"
      }, {
        "name" : "type",
        "type" : "SEMANTIC"
      } ]
    }, {
      "id" : "create-books",
      "name" : "books",
      "type" : "UNSAFE",
      "descriptor" : [ ],
      "rt" : "#book-representation"
    }, {
      "id" : "get-books",
      "name" : "books",
      "type" : "SAFE",
      "descriptor" : [ ],
      "rt" : "#book-representation"
    }, {
      "id" : "delete-book",
      "name" : "book",
      "type" : "IDEMPOTENT",
      "descriptor" : [ ],
      "rt" : "#book-representation"
    }, {
      "id" : "get-book",
      "name" : "book",
      "type" : "SAFE",
      "descriptor" : [ ],
      "rt" : "#book-representation"
    }, {
      "id" : "update-book",
      "name" : "book",
      "type" : "IDEMPOTENT",
      "descriptor" : [ ],
      "rt" : "#book-representation"
    }, {
      "id" : "patch-book",
      "name" : "book",
      "type" : "UNSAFE",
      "descriptor" : [ ],
      "rt" : "#book-representation"
    }, {
      "name" : "findByName",
      "type" : "SAFE",
      "descriptor" : [ {
        "name" : "name",
        "type" : "SEMANTIC"
      } ]
    } ]
  }
}
```
</details>
