insert into region(id, name) values(1, '수원');

insert into store(id, name, siteuri, region_id)
    values(1, '소우주', 'http://sowoojoo-escape.com/', 1);

insert into theme(id, name, genre, store_id)
    values(1, '풀문', 'Fantasy', 1);


