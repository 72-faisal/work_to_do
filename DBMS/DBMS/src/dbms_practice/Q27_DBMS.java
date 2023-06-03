package assignment2;

//xxvii. Modify the student table to change the sname length from 14 to 40. Create
//trigger to insert data in emp_log table whenever any update of sal in EMP table.
//You can set action as ‘New Salary’




//ALTER TABLE student MODIFY sname VARCHAR(40);

//CREATE TABLE IF NOT EXISTS emp_log (
//  log_id INT AUTO_INCREMENT PRIMARY KEY,
//  empno INT,
//  old_salary DECIMAL(10,2),
//  new_salary DECIMAL(10,2),
//  action VARCHAR(20),
//  log_timestamp TIMESTAMP
//);


//DELIMITER //
//CREATE TRIGGER trg_emp_sal_update
//AFTER UPDATE ON EMP FOR EACH ROW
//BEGIN
//  IF NEW.sal <> OLD.sal THEN
//    INSERT INTO emp_log (empno, old_salary, new_salary, action, log_timestamp)
//    VALUES (NEW.empno, OLD.sal, NEW.sal, 'New Salary', NOW());
//  END IF;
//END;
////
//DELIMITER ;

