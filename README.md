
<body>
    <h1>Spring Boot and Hibernate Project</h1>
    <p>This is a sample Spring Boot project with Hibernate and H2 database integration.</p>

  <h2>Table of Contents</h2>
  <ul>
      <li><a href="#about">About the Project</a></li>
      <li><a href="#setup">Setup Instructions</a></li>
      <li><a href="#usage">Usage</a></li>
      <li><a href="#api-endpoints">API Endpoints</a></li>
  </ul>

  <h2 id="about">About the Project</h2>
  <p>This project demonstrates how to create a simple RESTful API using Spring Boot, Hibernate, and H2 database. The application manages users by allowing you to create, read, and delete user records via HTTP requests.</p>

  <h2 id="setup">Setup Instructions</h2>
  <p>Follow the steps below to set up the project:</p>
  <ol>
      <li>Clone the repository:
          <pre><code>git clone https://github.com/your-repo-name/spring-hibernate-example.git</code></pre>
      </li>
      <li>Navigate to the project directory:
          <pre><code>cd spring-hibernate-example</code></pre>
      </li>
      <li>Ensure you have Java and Maven installed. Run the following command to build the project:
          <pre><code>mvn clean install</code></pre>
      </li>
      <li>Run the application using Maven:
          <pre><code>mvn spring-boot:run</code></pre>
      </li>
      <li>Open your browser and navigate to:
          <pre><code>http://localhost:9090</code></pre>
      </li>
  </ol>

  <h2 id="usage">Usage</h2>
  <p>Once the application is running, you can interact with it using tools like <strong>Postman</strong> or <strong>cURL</strong> to make HTTP requests.</p>

  <h3>Example: Add a User</h3>
  <p>To add a new user, send a POST request to the following endpoint:</p>
  <pre><code>POST http://localhost:9090/api/users</code></pre>
  <p>Body (JSON format):</p>
  <pre><code>{
  "name": "John Doe",
  "email": "john.doe@example.com"
}</code></pre>

  <h3>Example: Get All Users</h3>
  <p>To get all users, send a GET request to:</p>
  <pre><code>GET http://localhost:9090/api/users</code></pre>

  <h2 id="api-endpoints">API Endpoints</h2>
  <ul>
      <li><strong>POST /api/users</strong> - Create a new user</li>
      <li><strong>GET /api/users</strong> - Retrieve all users</li>
      <li><strong>GET /api/users/{id}</strong> - Retrieve a user by ID</li>
      <li><strong>DELETE /api/users/{id}</strong> - Delete a user by ID</li>
  </ul>

  <h2>Database Access</h2>
  <p>The project uses the in-memory H2 database. You can access the database console at:</p>
  <pre><code>http://localhost:9090/h2-console</code></pre>
  <p>JDBC URL: <code>jdbc:h2:mem:testdb</code><br>
  Username: <code>sa</code><br>
  Password: (leave it blank)
  </p>

</body>
</html>
