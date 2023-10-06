package net.jimblackler.jsonschemafriend;

import com.fasterxml.jackson.databind.ObjectMapper;

class MetaSchemaDraft04 {
    private static final String SCHEMA_JSON = "{\n" +
            "    \"id\": \"http://json-schema.org/draft-04/schema#\",\n" +
            "    \"$schema\": \"http://json-schema.org/draft-04/schema#\",\n" +
            "    \"description\": \"Core schema meta-schema\",\n" +
            "    \"definitions\": {\n" +
            "        \"schemaArray\": {\n" +
            "            \"type\": \"array\",\n" +
            "            \"minItems\": 1,\n" +
            "            \"items\": { \"$ref\": \"#\" }\n" +
            "        },\n" +
            "        \"positiveInteger\": {\n" +
            "            \"type\": \"integer\",\n" +
            "            \"minimum\": 0\n" +
            "        },\n" +
            "        \"positiveIntegerDefault0\": {\n" +
            "            \"allOf\": [ { \"$ref\": \"#/definitions/positiveInteger\" }, { \"default\": 0 } ]\n" +
            "        },\n" +
            "        \"simpleTypes\": {\n" +
            "            \"enum\": [ \"array\", \"boolean\", \"integer\", \"null\", \"number\", \"object\", \"string\" ]\n" +
            "        },\n" +
            "        \"stringArray\": {\n" +
            "            \"type\": \"array\",\n" +
            "            \"items\": { \"type\": \"string\" },\n" +
            "            \"minItems\": 1,\n" +
            "            \"uniqueItems\": true\n" +
            "        }\n" +
            "    },\n" +
            "    \"type\": \"object\",\n" +
            "    \"properties\": {\n" +
            "        \"id\": {\n" +
            "            \"type\": \"string\"\n" +
            "        },\n" +
            "        \"$schema\": {\n" +
            "            \"type\": \"string\"\n" +
            "        },\n" +
            "        \"title\": {\n" +
            "            \"type\": \"string\"\n" +
            "        },\n" +
            "        \"description\": {\n" +
            "            \"type\": \"string\"\n" +
            "        },\n" +
            "        \"default\": {},\n" +
            "        \"multipleOf\": {\n" +
            "            \"type\": \"number\",\n" +
            "            \"minimum\": 0,\n" +
            "            \"exclusiveMinimum\": true\n" +
            "        },\n" +
            "        \"maximum\": {\n" +
            "            \"type\": \"number\"\n" +
            "        },\n" +
            "        \"exclusiveMaximum\": {\n" +
            "            \"type\": \"boolean\",\n" +
            "            \"default\": false\n" +
            "        },\n" +
            "        \"minimum\": {\n" +
            "            \"type\": \"number\"\n" +
            "        },\n" +
            "        \"exclusiveMinimum\": {\n" +
            "            \"type\": \"boolean\",\n" +
            "            \"default\": false\n" +
            "        },\n" +
            "        \"maxLength\": { \"$ref\": \"#/definitions/positiveInteger\" },\n" +
            "        \"minLength\": { \"$ref\": \"#/definitions/positiveIntegerDefault0\" },\n" +
            "        \"pattern\": {\n" +
            "            \"type\": \"string\",\n" +
            "            \"format\": \"regex\"\n" +
            "        },\n" +
            "        \"additionalItems\": {\n" +
            "            \"anyOf\": [\n" +
            "                { \"type\": \"boolean\" },\n" +
            "                { \"$ref\": \"#\" }\n" +
            "            ],\n" +
            "            \"default\": {}\n" +
            "        },\n" +
            "        \"items\": {\n" +
            "            \"anyOf\": [\n" +
            "                { \"$ref\": \"#\" },\n" +
            "                { \"$ref\": \"#/definitions/schemaArray\" }\n" +
            "            ],\n" +
            "            \"default\": {}\n" +
            "        },\n" +
            "        \"maxItems\": { \"$ref\": \"#/definitions/positiveInteger\" },\n" +
            "        \"minItems\": { \"$ref\": \"#/definitions/positiveIntegerDefault0\" },\n" +
            "        \"uniqueItems\": {\n" +
            "            \"type\": \"boolean\",\n" +
            "            \"default\": false\n" +
            "        },\n" +
            "        \"maxProperties\": { \"$ref\": \"#/definitions/positiveInteger\" },\n" +
            "        \"minProperties\": { \"$ref\": \"#/definitions/positiveIntegerDefault0\" },\n" +
            "        \"required\": { \"$ref\": \"#/definitions/stringArray\" },\n" +
            "        \"additionalProperties\": {\n" +
            "            \"anyOf\": [\n" +
            "                { \"type\": \"boolean\" },\n" +
            "                { \"$ref\": \"#\" }\n" +
            "            ],\n" +
            "            \"default\": {}\n" +
            "        },\n" +
            "        \"definitions\": {\n" +
            "            \"type\": \"object\",\n" +
            "            \"additionalProperties\": { \"$ref\": \"#\" },\n" +
            "            \"default\": {}\n" +
            "        },\n" +
            "        \"properties\": {\n" +
            "            \"type\": \"object\",\n" +
            "            \"additionalProperties\": { \"$ref\": \"#\" },\n" +
            "            \"default\": {}\n" +
            "        },\n" +
            "        \"patternProperties\": {\n" +
            "            \"type\": \"object\",\n" +
            "            \"additionalProperties\": { \"$ref\": \"#\" },\n" +
            "            \"default\": {}\n" +
            "        },\n" +
            "        \"dependencies\": {\n" +
            "            \"type\": \"object\",\n" +
            "            \"additionalProperties\": {\n" +
            "                \"anyOf\": [\n" +
            "                    { \"$ref\": \"#\" },\n" +
            "                    { \"$ref\": \"#/definitions/stringArray\" }\n" +
            "                ]\n" +
            "            }\n" +
            "        },\n" +
            "        \"enum\": {\n" +
            "            \"type\": \"array\",\n" +
            "            \"minItems\": 1,\n" +
            "            \"uniqueItems\": true\n" +
            "        },\n" +
            "        \"type\": {\n" +
            "            \"anyOf\": [\n" +
            "                { \"$ref\": \"#/definitions/simpleTypes\" },\n" +
            "                {\n" +
            "                    \"type\": \"array\",\n" +
            "                    \"items\": { \"$ref\": \"#/definitions/simpleTypes\" },\n" +
            "                    \"minItems\": 1,\n" +
            "                    \"uniqueItems\": true\n" +
            "                }\n" +
            "            ]\n" +
            "        },\n" +
            "        \"format\": { \"type\": \"string\" },\n" +
            "        \"allOf\": { \"$ref\": \"#/definitions/schemaArray\" },\n" +
            "        \"anyOf\": { \"$ref\": \"#/definitions/schemaArray\" },\n" +
            "        \"oneOf\": { \"$ref\": \"#/definitions/schemaArray\" },\n" +
            "        \"not\": { \"$ref\": \"#\" }\n" +
            "    },\n" +
            "    \"dependencies\": {\n" +
            "        \"exclusiveMaximum\": [ \"maximum\" ],\n" +
            "        \"exclusiveMinimum\": [ \"minimum\" ]\n" +
            "    },\n" +
            "    \"default\": {}\n" +
            "}";

    static final Object SCHEMA;

    static {
        Object schemaObject;
        try {
            schemaObject = new ObjectMapper().readValue(SCHEMA_JSON, Object.class);
        }
        catch (Throwable ignored) {
            schemaObject = null;
        }
        SCHEMA = schemaObject;
    }
}
