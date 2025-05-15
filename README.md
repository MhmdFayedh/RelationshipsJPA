# RelationshipsJPA
### One-to-Many Tasks:

####  Basic One-to-Many Mapping:

* Create an Author entity and a Book entity.

* Use the @OneToMany and @ManyToOne annotations to establish a relationship where one author can have multiple books.

* Test saving an author with multiple books.

#### Bidirectional One-to-Many:

* Make the Book entity aware of its Author using a bidirectional mapping.

* Use mappedBy to link the two sides correctly.

* Test the cascading options.

#### Managing Orphan Entities:

* Use the orphanRemoval attribute to automatically remove books when they are no longer associated with an author.

### Database Design for OneToOne (Author && Book)

#### Author Table:
| Col Name   | Data Type | Additional Info |
|------------|-----------|-----------------|
| id         | bigint    | PK              |
| first_name | varchar   | //              |
| last_name  | varchar    | //              |
| email      | varchar    | //              |

#### Book Table:
| Col Name  | Data Type | Additional Info |
|-----------|-----------|-------------|
| id        | bigint    | PK          |
| title  | varchar   | //          |
| description | text      | //          |
| author_id | bigint    | FK |
