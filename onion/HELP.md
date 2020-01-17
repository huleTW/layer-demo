# 洋葱架构

洋葱架构由Jeffrey Palermo在2008年提出的。

洋葱架构旨在将面向数据库编程的方式，改成面向业务编程的方式。将关注核心从原来的数据库，转移到领域模型。

洋葱架构的依赖关系是外层可以依赖内层。

> the Key tenets of Onion Architecture:
> * The application is built around an independent object model
> * Inner layers define interfaces. Outer layers implement interfaces
> * Direction of coupling is toward the center
> * All application core code can be compiled and run separate from infrastructure
> 
>  --        Jeffrey Palermo 2008, The Onion Architecture: part 3