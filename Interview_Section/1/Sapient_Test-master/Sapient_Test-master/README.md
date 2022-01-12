Singleton beans with prototype-bean dependencies:-
____________________________________________________
** When We use singleton-scoped beans with dependencies on prototype beans,We should always aware that 
   dependencies are resolved at instantiation time.
 * if We are inject a prototype-scoped bean into a singleton-scoped bean a new prototype bean is instantiated and then dependency-injected into the singleton bean.
 * Because, prototype instance is the sole instance that is ever supplied to the singleton-scoped bean.

 * suppose you want the singleton-scoped bean to acquire a new instance of the prototype-scoped bean 
   repeatedly at runtime. 
 * You cannot dependency-inject a prototype-scoped bean into your singleton bean, because that injection 
   occurs only once, when the Spring container is instantiating the singleton bean and resolving and injecting
    its dependencies.  
   