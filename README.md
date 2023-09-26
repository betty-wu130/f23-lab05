# Inheritance and Delegation

This repository is set up for discussion on relative strengths and weaknesses of 
`inheritance` and `delegation` in 17214 23 fall recitation 05.

Lab05 Handout can be found at: [https://github.com/CMU-17-214/f2023/blob/main/labs/lab05.md](https://github.com/CMU-17-214/f2023/blob/main/labs/lab05.md)

1. inheritance is more dependent
2. both in this case, but generally inheritance is more likely to break down
3. delegation has less coupling than inheritance, thus is easier to be extended
    and inheritance means the sub-class must be the orginal class, but delegation
    does not have to be
4. in this case, I think delegation makes more sense, because the counting is more like
    an additional component of sortedlist, but not creating a specific type of it