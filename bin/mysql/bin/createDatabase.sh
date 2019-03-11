#!/usr/bin/env bash

mysql -h localhost -u root -p123456 --protocol tcp -e "CREATE DATABASE IF NOT EXISTS springCloud default charset utf8 COLLATE utf8_general_ci"