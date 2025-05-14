# RelationshipsJPA

### One-to-One Tasks:

#### Basic One-to-One Mapping:

* Create a User and UserProfile entity with a one-to-one relationship.

* Use the @OneToOne annotation to map the relationship.

* Save a user with a profile and retrieve it using Hibernate.

#### Bidirectional One-to-One:

* Make the UserProfile aware of the User using a bidirectional mapping.

* Use the mappedBy attribute to avoid creating two separate tables for the relationship.

* Test cascading operations (e.g., deleting a User should also delete its UserProfile).

#### Lazy Loading and Fetch Types:

* Experiment with FetchType.LAZY and FetchType.EAGER to see the impact on database queries.

* Use @JoinColumn to customize the foreign key column name.


### Database Design for OneToOne (User && UserProfile)

#### User Table:
| Col Name   | Data Type | Additional Info |
|------------|-----------|-----------------|
| id         | bigint    | PK              |
| first_name | varchar   | //              |
| last_name  | varchar    | //              |
| email      | varchar    | //              |

#### UserProfile Table:
| Col Name  | Data Type | Additional Info |
|-----------|-----------|-----------------|
| id        | bigint    | PK              |
| image_url | varchar   | //              |
| bio       | text      | //              |
| user_id   | bigint    | Unique Key + FK |