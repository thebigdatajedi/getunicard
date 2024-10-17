I'm creating this new repository so that I can have a place to store ideas that just hit me from nowhere, and I want to save and share them.  I want to call the repo getunicard. The idea for calling the tasks Unicards came from an idea (Task)  where I wanted to document ideas and inventions and record when and what they were.  I even started modeling them using Java and Springboot. I started with a general idea of how to build the software but got busy and couldn't continue.  The fundamental idea is that I create a PKM in which I just put stuff I encounter during the day and there is a layer that decides if what is on the Unicard is deemed for pros for a book or blog post or magazine article or code and what kind of software it would be for.  This PKM Broker layer could deem the Unicard to be suitable for a Copilot Task, or for a fiction book or nonfiction book or all of the above.  Here is the design so far.  Please take it as far as you can implementation wise:: - [ ]  CHANGES TO MAKE IN THE Design and to fix for the first deployment::
- [ ] Task will be an Abstract class, and we will have HumanTask because there will be another class to offer integrations through the API called MachineTask, which will have the same fields as Task but some unique ones like TriggerSuite ArrayList<TriggerList> will be Triggers from the Trigger table that will be discrete automation steps.
    - [ ] The classes changed with the design changes, but I don't think the DDL we initially came up with was right, so I will fix it first, and then we will worry about the new design elements.  The DDL was written before the SubTask class was seen on the DB as a 1 Task can have N SubTasks.  I'll mess with it, build it, deploy it, and we will have the Task Abstract class not be abstract for the first deployment.
- [ ] **FILE STRUCTURE FOR PLACING DDL FOR LIQUIDBASE TO USE :

```text
src/
└── main/
    └── resources/
        └── db/
            └── changelog/
                ├── changes/
                    ├── 0001Task.sql
                    └── 0002SubTask.sql
```