--
-- PostgreSQL database dump
--

-- Dumped from database version 9.6.3
-- Dumped by pg_dump version 9.6.3

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- Name: projec_skills; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE projec_skills (
    skill_id integer NOT NULL,
    project_id integer NOT NULL,
    score integer DEFAULT 0
);


ALTER TABLE projec_skills OWNER TO postgres;

--
-- Name: projects; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE projects (
    id integer NOT NULL,
    nrmatricol character varying(255),
    name character varying(255)
);


ALTER TABLE projects OWNER TO postgres;

--
-- Name: skills; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE skills (
    id integer NOT NULL,
    name character varying(255)
);


ALTER TABLE skills OWNER TO postgres;

--
-- Name: students; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE students (
    id integer NOT NULL,
    nrmatricol character varying(255),
    name character varying(255)
);


ALTER TABLE students OWNER TO postgres;

--
-- Name: students_skills; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE students_skills (
    skill_id integer NOT NULL,
    student_id integer NOT NULL
);


ALTER TABLE students_skills OWNER TO postgres;

--
-- Data for Name: projec_skills; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY projec_skills (skill_id, project_id, score) FROM stdin;
\.


--
-- Data for Name: projects; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY projects (id, nrmatricol, name) FROM stdin;
\.


--
-- Data for Name: skills; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY skills (id, name) FROM stdin;
\.


--
-- Data for Name: students; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY students (id, nrmatricol, name) FROM stdin;
\.


--
-- Data for Name: students_skills; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY students_skills (skill_id, student_id) FROM stdin;
\.


--
-- Name: projec_skills projec_skills_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY projec_skills
    ADD CONSTRAINT projec_skills_pkey PRIMARY KEY (skill_id, project_id);


--
-- Name: projects projects_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY projects
    ADD CONSTRAINT projects_pkey PRIMARY KEY (id);


--
-- Name: skills skills_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY skills
    ADD CONSTRAINT skills_pkey PRIMARY KEY (id);


--
-- Name: students students_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY students
    ADD CONSTRAINT students_pkey PRIMARY KEY (id);


--
-- Name: projec_skills fkid8olgpncafymre7whq7pun0y; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY projec_skills
    ADD CONSTRAINT fkid8olgpncafymre7whq7pun0y FOREIGN KEY (skill_id) REFERENCES projects(id);


--
-- Name: students_skills fkn01k9o6n0n7rf57crue00lw9m; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY students_skills
    ADD CONSTRAINT fkn01k9o6n0n7rf57crue00lw9m FOREIGN KEY (student_id) REFERENCES skills(id);


--
-- Name: projec_skills fkp30lkx99ula5npiky6jpxwki0; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY projec_skills
    ADD CONSTRAINT fkp30lkx99ula5npiky6jpxwki0 FOREIGN KEY (project_id) REFERENCES skills(id);


--
-- Name: students_skills fkrv56psjijkiuyeity2qm5sk5b; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY students_skills
    ADD CONSTRAINT fkrv56psjijkiuyeity2qm5sk5b FOREIGN KEY (skill_id) REFERENCES students(id);


--
-- PostgreSQL database dump complete
--

