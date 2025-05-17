package com.example.cpringclient.model;

public class EmployeeModel {
        private  Long id;
        private String name;
        private String location;
        private  String branch;
        public Long getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getLocation() {
            return location;
        }

        public String getBranch() {
            return branch;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public void setBranch(String branch) {
            this.branch = branch;
        }

}
