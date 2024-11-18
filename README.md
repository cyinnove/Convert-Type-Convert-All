# Content Type Converter - Burp Suite Extension

A powerful Burp Suite extension that helps in converting requests between different formats, making web application testing more efficient.

## Features

### Current Features
- Convert JSON POST requests to URL-encoded format
- Convert JSON POST requests to GET requests with URL parameters
- Convert XML to JSON format
- Convert URL-encoded to JSON format
- Support for nested JSON objects and arrays
- Automatic Content-Type header handling
- GraphQL request handling (variables extraction)

### What's New
- Added support for converting JSON POST requests to URL-encoded format
- Added support for converting JSON POST requests to GET requests
- Enhanced handling of nested JSON structures
- Improved error handling and user feedback
- Updated Java compatibility settings
- Added support for complex JSON arrays

### Original Project
This project is based on the original work from the [BurpJDSer](https://github.com/federicodotta/BurpJDSer) project. We've enhanced it with new features and improvements for better request format conversion capabilities.

## Installation

1. Download the latest JAR file from the releases page
2. Open Burp Suite Professional
3. Go to the "Extensions" tab
4. Click "Add"
5. Select "Java" as the extension type
6. Select the downloaded JAR file
7. Click "Next" to load the extension

## Usage

1. Right-click on any request in Burp Suite (Proxy, Repeater, etc.)
2. You'll see the following options in the context menu:
   - "Convert JSON to URL-encoded" - Converts JSON POST requests to URL-encoded format
   - "Convert JSON to GET Request" - Converts JSON POST requests to GET requests with parameters
   - "Convert to XML" - Converts requests to XML format
   - "Convert to JSON" - Converts requests to JSON format

## Building from Source

```bash
# Clone the repository
git clone https://github.com/h0tak88r/Convert-Type-Convert-All.git

# Navigate to the project directory
cd Convert-Type-Convert-All

# Build with Gradle
gradle fatJar
```

The compiled JAR file will be in `build/libs/content-type-converter-all.jar`

## Requirements
- Burp Suite Professional
- Java 8 or higher

## TODO List
- [ ] Add support for more content types (YAML, SOAP, etc.)
- [ ] Add configuration interface for custom conversion rules
- [ ] Implement request/response compression handling
- [ ] Add support for binary content types
- [ ] Implement custom header manipulation
- [ ] Add logging and debugging features
- [ ] Create comprehensive test suite
- [ ] Add support for custom encoding schemes
- [ ] Implement request history tracking
- [ ] Add batch conversion capabilities

## Contributing
Contributions are welcome! Please feel free to submit pull requests.

## License
This project is licensed under the MIT License - see the LICENSE file for details.

## Author
- [h0tak88r](https://github.com/h0tak88r)

## Acknowledgments
- Original [BurpJDSer](https://github.com/federicodotta/BurpJDSer) project
- Burp Suite Extension API
