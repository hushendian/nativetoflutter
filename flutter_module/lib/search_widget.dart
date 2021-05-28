import "package:flutter/material.dart";

class SearchApp extends StatelessWidget {
  final arguments;

  SearchApp(this.arguments);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
          appBar: AppBar(
            title: Text(arguments),
          ),
          body: Center(
              child: Container(
            child: Text('Hello World'),
          ))),
    );
  }
}
