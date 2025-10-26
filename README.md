# Descripción

Prueba de concepto para probar varias tecnologias al mismo tiempo:

- Creación de un modelo automático con el plugin de Maven *openapi-generator-maven-plugin* a partir de un 
  contrato *openapi.yaml*. Este contrato consiste en los DTOs de la capa que se consensua con frontend.
- Creación de un modelo persistente basado en entidades de mongodb
- Por último tenemos un dominio de negocio que maneja el comportamiento.
- La conversión entre las tres capas de modelado de datos se automatiza con *MapStruct*

# Uso

La idea es que cualquier cambio de contrato entre productor y consumidor se modifica en el esquema OpenAPI, al 
compilar se regeneran las clases DTO en **/target/generated-sources** y con MapStruct se realiza la conversión
entre ellas, dejando como resultado una separación clara entre las entidades que se persisten, las que se comparten
con terceros y el modelo de dominio interno en el que debemos manejar comportamiento de negocio.
