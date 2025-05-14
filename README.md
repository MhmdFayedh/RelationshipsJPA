# RelationshipsJPA

### One-to-One Tasks:

##### Basic One-to-One Mapping:

* Create a User and UserProfile entity with a one-to-one relationship.

* Use the @OneToOne annotation to map the relationship.

* Save a user with a profile and retrieve it using Hibernate.

##### Bidirectional One-to-One:

* Make the UserProfile aware of the User using a bidirectional mapping.

* Use the mappedBy attribute to avoid creating two separate tables for the relationship.

* Test cascading operations (e.g., deleting a User should also delete its UserProfile).

##### Lazy Loading and Fetch Types:

* Experiment with FetchType.LAZY and FetchType.EAGER to see the impact on database queries.

* Use @JoinColumn to customize the foreign key column name.

### One-to-Many Tasks:

#####  Basic One-to-Many Mapping:

* Create an Author entity and a Book entity.

* Use the @OneToMany and @ManyToOne annotations to establish a relationship where one author can have multiple books.

* Test saving an author with multiple books.

##### Bidirectional One-to-Many:

* Make the Book entity aware of its Author using a bidirectional mapping.

* Use mappedBy to link the two sides correctly.

* Test the cascading options.

##### Managing Orphan Entities:

* Use the orphanRemoval attribute to automatically remove books when they are no longer associated with an author.

### Many-to-Many Tasks:

##### Basic Many-to-Many Mapping:

* Create Student and Course entities with a many-to-many relationship.

* Use the @ManyToMany annotation and a JoinTable to handle the relationship.

* Test saving a student enrolled in multiple courses.

##### Bidirectional Many-to-Many:

* Make the relationship bidirectional by adding the corresponding @ManyToMany annotation in the other entity.

* Use the mappedBy attribute to avoid creating duplicate tables.

##### Adding Extra Columns to the Join Table:

* Modify the many-to-many relationship to include extra columns, like enrollmentDate or grade, by using an intermediate Enrollment entity.
