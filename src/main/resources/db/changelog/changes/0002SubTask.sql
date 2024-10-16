CREATE TABLE SubTask (
    id BIGINT IDENTITY(1,1) PRIMARY KEY,
    title NVARCHAR(255),
    status NVARCHAR(255),
    task_id BIGINT,
    FOREIGN KEY (task_id) REFERENCES Task(id)
);
