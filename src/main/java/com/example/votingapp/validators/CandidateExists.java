package com.example.votingapp.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({TYPE, ANNOTATION_TYPE})
@Retention(RUNTIME)
@Constraint(validatedBy = CandidateExistsValidator.class)
@Documented
public @interface CandidateExists {

    String message() default "Candidate does not exist";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
