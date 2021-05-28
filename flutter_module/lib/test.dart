import 'package:flutter/material.dart';
import 'package:flutter/services.dart';

void main() => runApp(TestApp());

class TestApp extends StatelessWidget {
  //获取到插件与原生的交互通道
  static const jumpPlugin = MethodChannel('com.hsd.jump/plugin');

  Future<Null> _jumpToNative() async {
    Map<String, String> map = {"path": "/main/SecondActivity"};
    String result = await jumpPlugin.invokeMethod('oneAct', map);

    print(result);
  }

  Future<Null> _jumpToNativeWithValue() async {
    Map<String, String> map = {"flutter": "这是一条来自flutter的参数"};

    String result = await jumpPlugin.invokeMethod('oneAct', map);

    print(result);
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Center(
        child: Column(children: [
          OutlinedButton(
            child: const Text("跳转到native页面"),
            onPressed: () => {_jumpToNative()},
          ),
          OutlinedButton(
            child: const Text("发送消息到native页面"),
            onPressed: () => {_jumpToNativeWithValue()},
          ),
        ]),
      ),
    );
  }
}
