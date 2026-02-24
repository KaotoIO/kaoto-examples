# Demo: File Monitor Workshop

## Purpose

The purpose of this demo is to create a route that demonstrates the **File Integration Pattern** using the file-watch component to monitor file system events and automatically backup newly created files.

## Prerequisites

1. **Kaoto UI**: install Kaoto according to the instruction in the [installation guide](https://kaoto.io/docs/installation/)

## Workflow

1. **File Monitoring** ([`file-monitor.camel.yaml`](file-monitor.camel.yaml))
   - Monitors the `/tmp/tutorial/` directory for file system events
   - Filters for CREATE events (new files)
   - Automatically copies newly created files to `/tmp/backup/` directory
   - Logs all detected file events with timestamp

## Running the Demo

1. Run Kaoto UI and open the `file-monitor.camel.yaml` route

2. Start the route by clicking the play icon

3. Test the file monitor:
   ```bash
   # Create a test file in the monitored directory
   echo "Test content" > /tmp/tutorial/test.txt
   ```

4. Monitor the output:
   - Check the logs for the detected CREATE event
   - Verify the file was copied to `/tmp/backup/` directory
   - Try modifying or deleting files to see that only CREATE events trigger the backup
