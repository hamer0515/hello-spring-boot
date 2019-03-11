#!/usr/bin/env bash

mysql -h localhost -u root -p123456 --protocol tcp -D springCloud -e "insert into user(username, password) values('forezp', '123456');commit;"
