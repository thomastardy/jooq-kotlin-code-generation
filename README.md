README
======

Start database
```
docker-compose -p jooq-kotlin-code-generation -f src/main/docker/postgresql.yml down && docker-compose -p jooq-kotlin-code-generation -f src/main/docker/postgresql.yml up
```

Update database and generate jooq code
```
./mvnw flyway:clean flyway:migrate jooq-codegen:generate
```
