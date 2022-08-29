create table candidates
(
    candidate_id serial
        constraint candidates_pk
            primary key,
    first_name   text not null,
    last_name    text not null
);

create table voters
(
    voter_id   serial
        constraint voters_pk
            primary key,
    first_name text not null,
    last_name  text not null
);

create table votes
(
    candidate_id integer
        constraint candidates_fk
            references candidates (candidate_id),
    voter_id     integer
        constraint voters_fk
            references voters (voter_id),
    constraint votes_pk
        primary key (candidate_id, voter_id)
);
