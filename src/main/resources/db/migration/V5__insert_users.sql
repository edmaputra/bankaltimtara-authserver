insert into app_user(id, username, password, account_expired, account_locked, credentials_expired, enabled, attempts)
  values (0, 'admin', /*admin1234*/'$2a$08$qvrzQZ7jJ7oy2p/msL4M0.l83Cd0jNsX6AJUitbgRXGzge4j035ha', FALSE, FALSE, FALSE, TRUE, 5);

insert into role(id, name) values (0, 'role_admin');

insert into permission(id, name)
    values (0, 'read'),(1, 'create'),(2,'update'),(3,'delete');

insert into role_user(user_id, role_id) values (0, 0);
insert into permission_role(permission_id, role_id) values (0, 0),(1,0),(2,0),(3,0);