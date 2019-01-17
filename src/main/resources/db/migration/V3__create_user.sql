create table app_user (
       id  bigserial not null,
        created_on timestamp not null default current_timestamp,
        updated_on timestamp not null default current_timestamp,
        version int8 not null default '0',
        account_expired boolean,
        account_locked boolean,
        credentials_expired boolean,
        email varchar(255),
        enabled boolean not null,
        password varchar(255),
        username varchar(255),
        attempts int4,
        primary key (id)
  );
 
    
    create table permission (
       id  bigserial not null,
        created_on timestamp not null default current_timestamp,
        updated_on timestamp not null default current_timestamp,
        version int8 not null default '0',
        name varchar(255),
        primary key (id)
    );
 
    
    create table permission_role (
       role_id int8 not null,
        permission_id int8 not null
    );
 
    
    create table role (
       id  bigserial not null,
        created_on timestamp not null default current_timestamp,
        updated_on timestamp not null default current_timestamp,
        version int8 not null default '0',
        name varchar(255),
        primary key (id)
    );
 
    
    create table role_user (
       user_id int8 not null,
        role_id int8 not null
    );
    
    alter table permission_role 
       add constraint FK3tuvkbyi6wcytyg21hvpd6txw 
       foreign key (permission_id) 
       references permission;
    
    alter table permission_role 
       add constraint FK50sfdcvbvdaclpn7wp4uop4ml 
       foreign key (role_id) 
       references role;
 
    
    alter table role_user 
       add constraint FKiqpmjd2qb4rdkej916ymonic6 
       foreign key (role_id) 
       references role;
 
    
    alter table role_user 
       add constraint FKfhbmfntjddrc0h05a0feowune 
       foreign key (user_id) 
       references app_user;
