# Use an outdated Node.js image
FROM node:10

# Add a vulnerable package.json
COPY package.json /app/package.json

# Install dependencies
RUN cd /app && npm install
