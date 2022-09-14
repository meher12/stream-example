## Stream In Java By example

1. map:
    ```
    List number = Arrays.asList(2,3,4,5);
    List square = number.stream().map(x->x*x).collect(Collectors.toList());
    ```
2. filter:
    ```
    List names = Arrays.asList("Reflection","Collection","Stream");
    List result = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
    ```
3. sorted:
    ```
    List names = Arrays.asList("Reflection","Collection","Stream");
    List result = names.stream().sorted().collect(Collectors.toList());
    ```
4. collect:
     ```
      List number = Arrays.asList(2,3,4,5,3);
      Set square = number.stream().map(x->x*x).collect(Collectors.toSet());
     ```
   
5. forEach:
   ```
   List number = Arrays.asList(2,3,4,5);
   number.stream().map(x->x*x).forEach(y->System.out.println(y));
   ```

6. reduce:
   ```
   List number = Arrays.asList(2,3,4,5);
   int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
   ```

