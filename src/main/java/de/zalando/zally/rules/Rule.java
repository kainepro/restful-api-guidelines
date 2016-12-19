package de.zalando.zally.rules;

import de.zalando.zally.Violation;
import io.swagger.models.Swagger;

import java.util.List;

interface Rule {

    List<Violation> validate(Swagger swagger);
}
