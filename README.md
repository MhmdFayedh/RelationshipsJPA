# RelationshipsJPA

### Many-to-Many Tasks:

#### Basic Many-to-Many Mapping:

* Create Student and Course entities with a many-to-many relationship.

* Use the @ManyToMany annotation and a JoinTable to handle the relationship.

* Test saving a student enrolled in multiple courses.

#### Bidirectional Many-to-Many:

* Make the relationship bidirectional by adding the corresponding @ManyToMany annotation in the other entity.

* Use the mappedBy attribute to avoid creating duplicate tables.

#### Adding Extra Columns to the Join Table:

* Modify the many-to-many relationship to include extra columns, like enrollmentDate or grade, by using an intermediate Enrollment entity.

### Database Design for ManyToMany ( User & Role and UserRole)

#### User Table:
| Col Name   | Data Type | Additional Info |
|------------|-----------|-----------------|
| id         | bigint    | PK              |
| first_name | varchar   | //              |
| last_name  | varchar    | //              |
| email      | varchar    | //              |

#### Role Table:
| Col Name | Data Type | Additional Info |
|----------|-----------|-----------------|
| id       | bigint    | PK              |
| name     | varchar   | //              |

#### UserRole Table:
| Col Name | Data Type | Additional Info |
|----------|-----------|-------------|
| user_id  | bigint    | PK          |
| role_id  | bigint    | PK          |

