# WarcraftLogs Java API

A Java wrapper for the warcraftlogs API.

As this API is in development, any piece may break at any point. 

Documentation may be found at: https://www.warcraftlogs.com/v1/docs

## Usage

For now, all calls are made through a low level wrapper on the API methods.

The [WarcraftLogsApi](https://github.com/Jarlenai/WarcraftLogs/blob/master/src/main/java/com/jarlenai/wcl/WarcraftLogsApi.java) class is used to call the methods. For each of the methods some utility classes are provided such as the [WarcraftServer](https://github.com/Jarlenai/WarcraftLogs/blob/master/src/main/java/com/jarlenai/wcl/domain/WarcraftServer.java) which has a list of all the warcraft servers and their slug names for calling into the API.  

Here's a quick example that shows how to print a list of report names for my guild on Whisperwind.


```
WarcraftLogsApi api = WarcraftLogsApi.get(yourApiKey);

api.getReportsForGuild("Nostalgia", WarcraftServer.Whisperwind, ServerRegion.US, null, null)
                .stream()
                .forEach(report -> System.out.println(report.title));

```

Additionally I'll place some examples in the [Examples](https://github.com/Jarlenai/WarcraftLogs/tree/master/src/main/java/com/jarlenai/wcl/example) directory at some point.

As you can see, optional parameters leave room for improvement. Rather than heavily overloading the methods, the builder pattern will provide much cleaner Apis; which brings me on to the next point...

## Future releases

In the future the WarcraftLogsService will provide higher level APIs and builders for method calls so that you don't have to pass a ton of nulls into the Retrofit API interface and for clarity in certain parts of the API.

## License

See the LICENSE file for License information.
