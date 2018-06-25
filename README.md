# update-cache-on-success


This is a little showcase to see how cache eviction works together with refreshing a cache.

It relies on REDIS running on 127.0.0.1:6379 (default for local installation).

## The service

### How to run it
./mvnw spring-boot:run
or
./mvnw.bat spring-boot:run

### What is it about?
After starting the service you can test it on http://localhost:8080/<anyGithubUserName> e.g. [http://localhost:8080/eiselems](http://localhost:8080/eiselems).

The service sadly has a high failure rate (Hey I KNOW, github is fine ...),
the error is introduced manually on this test service.
In 50% of the cases it throws a RunTimeException.

Thankfully this service here is caching the response. The response is cached for 20 seconds.

What this should show:
* After successful retrieval it is stored for 20seconds
* After trying it again after more than 20 seconds the request is executed again
* When the cache is empty (nothing can be done here), or the cache expired (after more than 20s) the exception bubbles up until it reaches the controller (=> the user).

Is there a way around so that instead of bubbling up the exception - that we can return the previous value?