class student {
    enum Gender {MALE , FEMALE , UNKNOWN};
    String name = "匿名";
    Gender gender = Gender.UNKNOWN;

    public boolean equals(object obj) {
        Student s = (Student)obj;
        return (this.neme == s.name && this.gender == s.gender);
    }
}
