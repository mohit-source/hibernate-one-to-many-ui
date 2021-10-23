use test;
CREATE TABLE Person_o2m_Uni (
id bigint not null,
name varchar(255),
primary key (id)
);

CREATE TABLE Phone_o2m_Uni (
	id bigint not null,
    phone_number varchar(255),
    person_id bigint,
    primary key (id)
);

CREATE TABLE Person_o2m_Uni_Phone_o2m_Uni (
	person_id bigint not null,
    phones_id bigint not null,
     primary key(person_id,phones_id),
     
     foreign key (person_id)
		references Person_o2m_Uni(id),
	 foreign key (phones_id)
		references Phone_o2m_Uni(id) 
);

